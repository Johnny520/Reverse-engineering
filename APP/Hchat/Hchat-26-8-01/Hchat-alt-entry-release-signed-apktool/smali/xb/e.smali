.class public final Lxb/e;
.super Lyf/c;


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public h:I

.field public final synthetic i:Lxb/f;


# direct methods
.method public constructor <init>(Lxb/f;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb/e;->i:Lxb/f;

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
    iput-object p1, p0, Lxb/e;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lxb/e;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lxb/e;->h:I

    .line 9
    .line 10
    iget-object p1, p0, Lxb/e;->i:Lxb/f;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lxb/f;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
