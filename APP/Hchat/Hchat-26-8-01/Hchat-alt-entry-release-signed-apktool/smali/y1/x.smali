.class public final Ly1/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf2/y;


# instance fields
.field public g:Z

.field public final synthetic h:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/x;->h:Lf1/r0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lf2/x;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ly1/x;->h:Lf1/r0;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Ly1/x;->g:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
