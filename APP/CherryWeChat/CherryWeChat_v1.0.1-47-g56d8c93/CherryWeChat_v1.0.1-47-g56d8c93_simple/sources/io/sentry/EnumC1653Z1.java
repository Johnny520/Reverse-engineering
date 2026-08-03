package io.sentry;

import io.sentry.clientreport.C1851b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1957g;

/* JADX INFO: renamed from: io.sentry.Z1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1653Z1 extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1653Z1[] $VALUES = null;
    public static final EnumC1653Z1 Attachment = null;
    public static final EnumC1653Z1 CheckIn = null;
    public static final EnumC1653Z1 ClientReport = null;
    public static final EnumC1653Z1 Event = null;
    public static final EnumC1653Z1 Feedback = null;
    public static final EnumC1653Z1 Log = null;
    public static final EnumC1653Z1 Profile = null;
    public static final EnumC1653Z1 ProfileChunk = null;
    public static final EnumC1653Z1 ReplayEvent = null;
    public static final EnumC1653Z1 ReplayRecording = null;
    public static final EnumC1653Z1 ReplayVideo = null;
    public static final EnumC1653Z1 Session = null;
    public static final EnumC1653Z1 Transaction = null;
    public static final EnumC1653Z1 Unknown = null;
    public static final EnumC1653Z1 UserFeedback = null;
    private final String itemType;

    private static /* synthetic */ EnumC1653Z1[] $values() {
        return new EnumC1653Z1[]{Session, Event, UserFeedback, Attachment, Transaction, Profile, ProfileChunk, ClientReport, ReplayEvent, ReplayRecording, ReplayVideo, CheckIn, Feedback, Log, Unknown};
    }

    static {
        Session = new EnumC1653Z1("Session", 0, "session");
        Event = new EnumC1653Z1("Event", 1, "event");
        UserFeedback = new EnumC1653Z1("UserFeedback", 2, "user_report");
        Attachment = new EnumC1653Z1("Attachment", 3, "attachment");
        Transaction = new EnumC1653Z1("Transaction", 4, "transaction");
        Profile = new EnumC1653Z1("Profile", 5, "profile");
        ProfileChunk = new EnumC1653Z1("ProfileChunk", 6, "profile_chunk");
        ClientReport = new EnumC1653Z1("ClientReport", 7, "client_report");
        ReplayEvent = new EnumC1653Z1("ReplayEvent", 8, "replay_event");
        ReplayRecording = new EnumC1653Z1("ReplayRecording", 9, "replay_recording");
        ReplayVideo = new EnumC1653Z1("ReplayVideo", 10, "replay_video");
        CheckIn = new EnumC1653Z1("CheckIn", 11, "check_in");
        Feedback = new EnumC1653Z1("Feedback", 12, "feedback");
        Log = new EnumC1653Z1("Log", 13, "log");
        Unknown = new EnumC1653Z1("Unknown", 14, "__unknown__");
        $VALUES = $values();
    }

    EnumC1653Z1(String r1, int r2, String r3) {
        this.itemType = r3;
    }

    public static EnumC1653Z1 resolve(Object r2) {
        if ((r2 instanceof C1627R1) == false) goto L11;
        if (((C1957g) ((C1627R1) r2).f5605b.m4152u(C1957g.class, "feedback")) != null) goto L9;
        return Event;
    L9:
        return Feedback;
    L11:
        if ((r2 instanceof C1944A) == false) goto L15;
        return Transaction;
    L15:
        if ((r2 instanceof C1581F2) == false) goto L19;
        return Session;
    L19:
        if ((r2 instanceof C1851b) == false) goto L23;
        return ClientReport;
    L23:
        return Attachment;
    }

    public static EnumC1653Z1 valueOf(String r1) {
        return (EnumC1653Z1) Enum.valueOf(EnumC1653Z1.class, r1);
    }

    public static EnumC1653Z1 valueOfLabel(String r5) {
        EnumC1653Z1[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        EnumC1653Z1 r3 = r0[r2];
        if (r3.itemType.equals(r5) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        return Unknown;
    }

    public static EnumC1653Z1[] values() {
        return (EnumC1653Z1[]) $VALUES.clone();
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r1, ILogger r2) {
        C1901c r12 = (C1901c) r1;
        r12.m4115z(this.itemType);
    }
}
