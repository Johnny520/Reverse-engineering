.class public final Ly1/w;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lf/x;

.field public h:Lsg/b;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ly1/z;

.field public k:I


# direct methods
.method public constructor <init>(Ly1/z;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/w;->j:Ly1/z;

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
    iput-object p1, p0, Ly1/w;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly1/w;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly1/w;->k:I

    .line 9
    .line 10
    iget-object p1, p0, Ly1/w;->j:Ly1/z;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Ly1/z;->e(Lyf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
