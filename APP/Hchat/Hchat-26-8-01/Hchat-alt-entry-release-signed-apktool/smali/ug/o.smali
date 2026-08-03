.class public final Lug/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwf/c;
.implements Lyf/d;


# instance fields
.field public final g:Lwf/c;

.field public final h:Lwf/g;


# direct methods
.method public constructor <init>(Lwf/c;Lwf/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lug/o;->g:Lwf/c;

    .line 5
    .line 6
    iput-object p2, p0, Lug/o;->h:Lwf/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCallerFrame()Lyf/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lug/o;->g:Lwf/c;

    .line 2
    .line 3
    instance-of v1, v0, Lyf/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lyf/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getContext()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lug/o;->h:Lwf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lug/o;->g:Lwf/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lwf/c;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
