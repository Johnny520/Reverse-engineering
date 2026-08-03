.class public abstract Lr4/y;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Lv4/d0;


# direct methods
.method public constructor <init>(Lv4/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr4/z;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lr4/y;->h:Lv4/d0;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "type == null"

    .line 10
    .line 11
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method
