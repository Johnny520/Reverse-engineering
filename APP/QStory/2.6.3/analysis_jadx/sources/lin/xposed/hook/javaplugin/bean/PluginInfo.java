package lin.xposed.hook.javaplugin.bean;

import bsh.Interpreter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginInfo {
    private String date;
    private String iconPath;
    private Interpreter interpreter;
    private String pluginAuthor;
    private String pluginDesc;
    private String pluginID;
    private String pluginLocalPath;
    private String pluginName;
    private String pluginVersion;
    private List<String> previewPaths;
    private String tags;

    public String getDate() {
        return this.date;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public Interpreter getInterpreter() {
        return this.interpreter;
    }

    public String getPluginAuthor() {
        return this.pluginAuthor;
    }

    public String getPluginDesc() {
        return this.pluginDesc;
    }

    public String getPluginID() {
        return this.pluginID;
    }

    public String getPluginLocalPath() {
        return this.pluginLocalPath;
    }

    public String getPluginName() {
        return this.pluginName;
    }

    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public List<String> getPreviewPaths() {
        return this.previewPaths;
    }

    public String getTags() {
        return this.tags;
    }

    public PluginInfo setDate(String str) {
        this.date = str;
        return this;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    public void setPluginAuthor(String str) {
        this.pluginAuthor = str;
    }

    public void setPluginDesc(String str) {
        this.pluginDesc = str;
    }

    public void setPluginID(String str) {
        this.pluginID = str;
    }

    public void setPluginLocalPath(String str) {
        this.pluginLocalPath = str;
    }

    public void setPluginName(String str) {
        this.pluginName = str;
    }

    public void setPluginVersion(String str) {
        this.pluginVersion = str;
    }

    public void setPreviewPaths(List<String> list) {
        this.previewPaths = list;
    }

    public void setTags(String str) {
        this.tags = str;
    }
}
