.class public final Ls/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/d;


# instance fields
.field public final synthetic a:Ls/r;

.field public final synthetic b:Lgg/u;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Ls/r;Lgg/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/q;->a:Ls/r;

    .line 5
    .line 6
    iput-object p2, p0, Ls/q;->b:Lgg/u;

    .line 7
    .line 8
    iput p3, p0, Ls/q;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ls/q;->b:Lgg/u;

    .line 2
    .line 3
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls/m;

    .line 6
    .line 7
    iget v1, p0, Ls/q;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Ls/q;->a:Ls/r;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Ls/r;->k1(Ls/m;I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method
