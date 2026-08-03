package io.sentry;

import io.sentry.clientreport.C1851b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1957g;

/* JADX INFO: renamed from: io.sentry.Z1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1653Z1 implements InterfaceC1567C0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    Unknown("__unknown__");

    private final String itemType;

    EnumC1653Z1(String str) {
        this.itemType = str;
    }

    public static EnumC1653Z1 resolve(Object obj) {
        return obj instanceof C1627R1 ? ((C1957g) ((C1627R1) obj).f5605b.m4152u(C1957g.class, "feedback")) == null ? Event : Feedback : obj instanceof C1944A ? Transaction : obj instanceof C1581F2 ? Session : obj instanceof C1851b ? ClientReport : Attachment;
    }

    public static EnumC1653Z1 valueOfLabel(String str) {
        for (EnumC1653Z1 enumC1653Z1 : values()) {
            if (enumC1653Z1.itemType.equals(str)) {
                return enumC1653Z1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(this.itemType);
    }
}
