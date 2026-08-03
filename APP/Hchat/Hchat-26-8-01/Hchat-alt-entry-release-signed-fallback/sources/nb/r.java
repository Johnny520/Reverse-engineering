package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends android.speech.tts.UtteranceProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb.w f9302a;

    public r(nb.w r1) {
            r0 = this;
            r0.f9302a = r1
            r0.<init>()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String r5) {
            r4 = this;
            nb.w r0 = r4.f9302a
            android.os.Handler r1 = r0.f9312b
            nb.f r2 = new nb.f
            r3 = 2
            r2.<init>(r0, r5, r3)
            r1.post(r2)
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r5) {
            r4 = this;
            nb.w r0 = r4.f9302a
            android.os.Handler r1 = r0.f9312b
            nb.f r2 = new nb.f
            r3 = 3
            r2.<init>(r0, r5, r3)
            r1.post(r2)
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r4, int r5) {
            r3 = this;
            nb.w r5 = r3.f9302a
            android.os.Handler r0 = r5.f9312b
            nb.f r1 = new nb.f
            r2 = 1
            r1.<init>(r5, r4, r2)
            r0.post(r1)
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onRangeStart(java.lang.String r3, int r4, int r5, int r6) {
            r2 = this;
            nb.w r5 = r2.f9302a
            android.os.Handler r6 = r5.f9312b
            e9.o r0 = new e9.o
            r1 = 2
            r0.<init>(r5, r3, r4, r1)
            r6.post(r0)
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String r1) {
            r0 = this;
            return
    }
}
