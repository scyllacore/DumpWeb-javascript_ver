let manageHandler;

document.addEventListener("DOMContentLoaded", () => {
    manageHandler = new ManageHandler(paramsContainer);
})

const func = {
    async save() {
        await manageHandler.save('step7');
    },
    async remove() {
        await manageHandler.remove('step7')
    },
    async listRetrieval() {
        await manageHandler.listRetrieval('step7')
    },
    async submitterListRetrieval() {
        await manageHandler.submitterListRetrieval('step7Driver')
    }
}