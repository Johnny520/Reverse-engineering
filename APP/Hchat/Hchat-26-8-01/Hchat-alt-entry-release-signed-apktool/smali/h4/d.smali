.class public final Lh4/d;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lv4/f0;


# direct methods
.method public constructor <init>(Lv4/f0;)V
    .locals 1

    .line 1
    const-string v0, "ConstantValue"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lv4/c0;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    instance-of v0, p1, Lv4/o;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    instance-of v0, p1, Lv4/v;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    instance-of v0, p1, Lv4/n;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    instance-of v0, p1, Lv4/k;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const-string p1, "constantValue == null"

    .line 29
    .line 30
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    throw p1

    .line 35
    :cond_0
    const-string p1, "bad type for constantValue"

    .line 36
    .line 37
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    throw p1

    .line 42
    :cond_1
    iput-object p1, p0, Lh4/d;->b:Lv4/f0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method
