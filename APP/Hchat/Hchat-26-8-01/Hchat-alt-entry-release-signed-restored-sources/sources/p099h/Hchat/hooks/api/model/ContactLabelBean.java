package p099h.Hchat.hooks.api.model;

import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ContactLabelBean {
    public static final int $stable = 8;
    public final String labelId;
    public final String labelName;
    public final List<String> userNameList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContactLabelBean(String str, String str2, List<String> list) {
        this.labelId = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.labelName = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        List<String> listM8407P1 = list != null ? AbstractC4166m.m8407P1(list) : null;
        this.userNameList = listM8407P1 == null ? C4173t.f13710g : listM8407P1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getContactList() {
        return this.userNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getId() {
        return this.labelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLabelId() {
        return this.labelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLabelName() {
        return this.labelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.labelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getUserNameList() {
        return this.userNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getUsernameList() {
        return this.userNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.labelId;
        String str2 = this.labelName;
        List<String> list = this.userNameList;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ContactLabelBean(labelId=", str, ", labelName=", str2, ", userNameList=");
        sbM1027p.append(list);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
