package com.scyllacore.dumpWeb.commonModule.db.mapper.manage;

import com.scyllacore.dumpWeb.commonModule.db.dto.manage.SearchOption;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.TDrive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Step6MapperForVehicleManageMileageViewer {
    List<TDrive> selectCarListByOption(SearchOption option);

    void updateTDriveChk2ForProcess(SearchOption option);


    void updateTDriveChk2ForCancel(SearchOption option);
}
