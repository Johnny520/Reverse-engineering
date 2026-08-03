--[[
    Hook 示例脚本
    演示如何使用 Lua 进行 Xposed Hook
    注意：此脚本需要在 Xposed 环境中运行
]]

print("=== Hook Demo ===")

-- 示例1: Hook 一个方法，打印调用信息
local hookId = cherry.hook({
    class = "android.util.Log",
    method = "d",
    params = {"java.lang.String", "java.lang.String"},
    before = function(param)
        local tag = param.args[1]
        local msg = param.args[2]
        print("[Hook] Log.d called: " .. tostring(tag) .. " -> " .. tostring(msg))
    end
})

if hookId then
    print("Hook 成功: " .. hookId)
else
    print("Hook 失败 (可能不在 Xposed 环境)")
end

-- 示例2: Hook 并修改返回值
--[[
cherry.hookReplace({
    class = "com.example.Utils",
    method = "isVip",
    replace = function(param)
        print("isVip 被调用，返回 true")
        return true
    end
})
]]

-- 示例3: Hook 并修改参数
--[[
cherry.hook({
    class = "com.example.Api",
    method = "request",
    before = function(param)
        -- 修改第一个参数
        param.setArg(1, "modified_value")
        print("参数已修改")
    end
})
]]

-- 示例4: 使用辅助函数
local testObj = {name = "test"}
-- cherry.callMethod(obj, "methodName", arg1, arg2)
-- cherry.getField(obj, "fieldName")
-- cherry.setField(obj, "fieldName", newValue)

-- 示例5: 查找类
local LogClass = cherry.findClass("android.util.Log")
if LogClass then
    print("找到类: " .. tostring(LogClass))
end

-- 清理 Hook (可选)
-- cherry.unhook(hookId)
-- cherry.unhookAll()

return "Hook demo completed"
