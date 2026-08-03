--[[
    Java 互操作示例
    演示如何在 Lua 中使用 Java 类
]]

print("=== Java Interop Demo ===")

-- 导入 Java 类
local Toast = import("android.widget.Toast")
local Log = import("android.util.Log")
local TextView = import("android.widget.TextView")
local LinearLayout = import("android.widget.LinearLayout")
local Color = import("android.graphics.Color")

-- 获取 Context
local context = cherry.getContext()

if context then
    print("Context 获取成功: " .. tostring(context))

    -- 使用 Toast (静态方法)
    local toast = Toast.makeText(context, "来自 Lua 的 Toast!", Toast.LENGTH_SHORT)
    toast:show()

    -- 使用 Log
    Log.d("LuaDemo", "这是来自 Lua 的日志")

    -- 创建 TextView (需要在 UI 线程)
    cherry.runOnUiThread(function()
        local activity = cherry.getActivity()
        if activity then
            local tv = TextView(activity)
            tv:setText("Lua 创建的 TextView")
            tv:setTextColor(Color.RED)
            tv:setTextSize(18.0)
            print("TextView 创建成功")
        end
    end)
else
    print("无法获取 Context")
end

-- 测试数学运算
local Math = import("java.lang.Math")
local result = Math.sqrt(144)
print("Math.sqrt(144) = " .. result)

local random = Math.random()
print("Math.random() = " .. random)

-- 测试字符串操作
local StringBuilder = import("java.lang.StringBuilder")
local sb = StringBuilder()
sb:append("Hello")
sb:append(" ")
sb:append("Lua!")
print("StringBuilder result: " .. sb:toString())

return "Java interop demo completed!"
