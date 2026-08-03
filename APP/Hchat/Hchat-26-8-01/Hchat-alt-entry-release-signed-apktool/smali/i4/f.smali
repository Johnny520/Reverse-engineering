.class public final Li4/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Lv4/d0;


# direct methods
.method public constructor <init>(IIILv4/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-lt p2, p1, :cond_1

    .line 7
    .line 8
    if-ltz p3, :cond_0

    .line 9
    .line 10
    iput p1, p0, Li4/f;->a:I

    .line 11
    .line 12
    iput p2, p0, Li4/f;->b:I

    .line 13
    .line 14
    iput p3, p0, Li4/f;->c:I

    .line 15
    .line 16
    iput-object p4, p0, Li4/f;->d:Lv4/d0;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "handlerPc < 0"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1

    .line 26
    :cond_1
    const-string p1, "endPc < startPc"

    .line 27
    .line 28
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :cond_2
    const-string p1, "startPc < 0"

    .line 34
    .line 35
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1
.end method
