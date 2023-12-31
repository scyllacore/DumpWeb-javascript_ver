package com.scyllacore.dumpWeb.commonModule.db.mapper.manage;

import com.scyllacore.dumpWeb.commonModule.db.dto.manage.MileageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Step5ForVehicleManageMileageRegistrationMapper {
    void insertMileage(MileageDTO mileage);

    void updateMileage(MileageDTO mileage);

    void deleteMileage(MileageDTO mileage);

    List<MileageDTO> selectMileageList(MileageDTO mileage);

    MileageDTO selectMileage(MileageDTO mileage);
}
