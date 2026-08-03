.class public final Lh4/f;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lv4/d0;

.field public final c:Lv4/z;


# direct methods
.method public constructor <init>(Lv4/d0;Lv4/z;)V
    .locals 1

    .line 1
    const-string v0, "EnclosingMethod"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lh4/f;->b:Lv4/d0;

    .line 9
    .line 10
    iput-object p2, p0, Lh4/f;->c:Lv4/z;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "type == null"

    .line 14
    .line 15
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    return v0
.end method
