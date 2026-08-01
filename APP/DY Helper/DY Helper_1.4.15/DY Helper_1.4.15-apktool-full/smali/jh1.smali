.class public abstract Ljh1;
.super Ljava/util/concurrent/CancellationException;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    .line 1
    sget-object v0, Lh62;->ε:[Ljava/lang/StackTraceElement;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
