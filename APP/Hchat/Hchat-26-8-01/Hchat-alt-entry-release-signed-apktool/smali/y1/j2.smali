.class public final Ly1/j2;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Ly1/a;

.field public final synthetic h:Ly1/i2;

.field public final synthetic i:Lokio/a;


# direct methods
.method public constructor <init>(Ly1/a;Ly1/i2;Lokio/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/j2;->g:Ly1/a;

    .line 2
    .line 3
    iput-object p2, p0, Ly1/j2;->h:Ly1/i2;

    .line 4
    .line 5
    iput-object p3, p0, Ly1/j2;->i:Lokio/a;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/j2;->h:Ly1/i2;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/j2;->g:Ly1/a;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, La7/a;->w(Landroid/view/View;)Lk3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lk3/a;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, Ly1/j2;->i:Lokio/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0
.end method
