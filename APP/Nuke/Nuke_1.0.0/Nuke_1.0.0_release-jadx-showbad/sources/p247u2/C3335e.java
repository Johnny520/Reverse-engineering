package p247u2;

import java.sql.Timestamp;
import java.util.Date;
import p230r2.AbstractC3131g;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3335e extends AbstractC3131g {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10375c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3335e(int i5, Class cls) {
        super(cls);
        this.f10375c = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3131g
    /* JADX INFO: renamed from: a */
    public final Date mo5410a(Date date) {
        switch (this.f10375c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
