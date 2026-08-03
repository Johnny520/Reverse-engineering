.class public abstract Lyf/g;
.super Lyf/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Lwf/c;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lyf/a;-><init>(Lwf/c;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p1}, Lwf/c;->getContext()Lwf/g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p1, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getContext()Lwf/g;
    .locals 1

    .line 1
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 2
    .line 3
    return-object v0
.end method
