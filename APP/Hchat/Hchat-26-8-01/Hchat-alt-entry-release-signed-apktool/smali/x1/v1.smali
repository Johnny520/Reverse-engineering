.class public final Lx1/v1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/s1;


# instance fields
.field public g:Lv1/o0;

.field public final h:Lx1/n0;


# direct methods
.method public constructor <init>(Lv1/o0;Lx1/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/v1;->g:Lv1/o0;

    .line 5
    .line 6
    iput-object p2, p0, Lx1/v1;->h:Lx1/n0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v1;->h:Lx1/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/n0;->T0()Lv1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
