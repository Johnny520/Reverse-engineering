.class public final synthetic Lx6/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lx6/b;->g:I

    .line 5
    .line 6
    iput p2, p0, Lx6/b;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lsf/e;

    .line 2
    .line 3
    iget-object v0, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    iget v1, p0, Lx6/b;->g:I

    .line 12
    .line 13
    invoke-static {v1, v0}, Lx6/g;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lx6/b;->h:I

    .line 18
    .line 19
    invoke-static {v1, p1}, Lx6/g;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, " | "

    .line 24
    .line 25
    const-string v2, " |"

    .line 26
    .line 27
    const-string v3, "| "

    .line 28
    .line 29
    invoke-static {v3, v0, v1, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method
