package p001;

/** Removes visit-history rows older than the configured retention period. */
public final class RunnableC0297l8 implements Runnable {

    @Override
    public void run() {
        InterfaceC0472yb historyDao = C0283k8.a.m884().mo985();
        Integer configuredDays = C0393sa.m1234(C0192e1.m847(EnumC0164c1.f1385));
        historyDao.mo971(configuredDays != null ? configuredDays.intValue() : 15);
    }
}
