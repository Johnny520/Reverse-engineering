.class public final Lyu;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lzt0;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(ILzt0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lyu;->d:Lzt0;

    .line 2
    .line 3
    iput p1, p0, Lyu;->e:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldv;

    .line 2
    .line 3
    iget v0, p0, Lyu;->e:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ldv;->D0(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lyu;->d:Lzt0;

    .line 14
    .line 15
    iput-object p1, p0, Lzt0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p1
.end method
