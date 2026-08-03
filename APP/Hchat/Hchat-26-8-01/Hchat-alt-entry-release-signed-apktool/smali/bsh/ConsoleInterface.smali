.class public interface abstract Lbsh/ConsoleInterface;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public abstract error(Ljava/lang/Object;)V
.end method

.method public abstract getErr()Ljava/io/PrintStream;
.end method

.method public abstract getIn()Ljava/io/Reader;
.end method

.method public abstract getOut()Ljava/io/PrintStream;
.end method

.method public abstract print(Ljava/lang/Object;)V
.end method

.method public abstract println(Ljava/lang/Object;)V
.end method

.method public prompt(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lbsh/ConsoleInterface;->print(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
