.class public final Lh4/o;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lv4/c0;


# direct methods
.method public constructor <init>(Lv4/c0;)V
    .locals 1

    .line 1
    const-string v0, "Signature"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lh4/o;->b:Lv4/c0;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "signature == null"

    .line 12
    .line 13
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
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
