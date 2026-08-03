package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import kotlin.Metadata;
import p000a.InterfaceC0295Q4;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/g;", "lifecycle-common"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class DefaultLifecycleObserverAdapter implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0295Q4 f4640a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1118g f4641b;

    /* JADX INFO: renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C1108a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC1116e.a.values().length];
            try {
                iArr[AbstractC1116e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1116e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1116e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1116e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1116e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1116e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1116e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC0295Q4 interfaceC0295Q4, InterfaceC1118g interfaceC1118g) {
        this.f4640a = interfaceC0295Q4;
        this.f4641b = interfaceC1118g;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        int i = C1108a.$EnumSwitchMapping$0[aVar.ordinal()];
        InterfaceC0295Q4 interfaceC0295Q4 = this.f4640a;
        if (i == 3) {
            interfaceC0295Q4.mo835b(interfaceC0935y9);
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1118g interfaceC1118g = this.f4641b;
        if (interfaceC1118g != null) {
            interfaceC1118g.mo485a(interfaceC0935y9, aVar);
        }
    }
}
