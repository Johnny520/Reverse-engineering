.class public final Li4/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lv4/c0;

.field public final d:Lv4/c0;

.field public final e:Lv4/c0;

.field public final f:I


# direct methods
.method public constructor <init>(IILv4/c0;Lv4/c0;Lv4/c0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_5

    .line 5
    .line 6
    if-ltz p2, :cond_4

    .line 7
    .line 8
    if-eqz p3, :cond_3

    .line 9
    .line 10
    if-nez p4, :cond_1

    .line 11
    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p1, "(descriptor == null) && (signature == null)"

    .line 16
    .line 17
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    if-ltz p6, :cond_2

    .line 23
    .line 24
    iput p1, p0, Li4/q;->a:I

    .line 25
    .line 26
    iput p2, p0, Li4/q;->b:I

    .line 27
    .line 28
    iput-object p3, p0, Li4/q;->c:Lv4/c0;

    .line 29
    .line 30
    iput-object p4, p0, Li4/q;->d:Lv4/c0;

    .line 31
    .line 32
    iput-object p5, p0, Li4/q;->e:Lv4/c0;

    .line 33
    .line 34
    iput p6, p0, Li4/q;->f:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    const-string p1, "index < 0"

    .line 38
    .line 39
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :cond_3
    const-string p1, "name == null"

    .line 45
    .line 46
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    throw p1

    .line 51
    :cond_4
    const-string p1, "length < 0"

    .line 52
    .line 53
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    throw p1

    .line 58
    :cond_5
    const-string p1, "startPc < 0"

    .line 59
    .line 60
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1
.end method
