.class public final Ly1/j0;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ly1/k0;

.field public i:I


# direct methods
.method public constructor <init>(Ly1/k0;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/j0;->h:Ly1/k0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ly1/j0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly1/j0;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly1/j0;->i:I

    .line 9
    .line 10
    iget-object p1, p0, Ly1/j0;->h:Ly1/k0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Ly1/k0;->a(Lf0/u;Lyf/c;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 17
    .line 18
    return-object p1
.end method
