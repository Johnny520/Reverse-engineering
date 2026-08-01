.class public final Lmy0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Len0;


# instance fields
.field public final d:I

.field public final e:Ljava/util/List;

.field public f:Ljava/lang/Float;

.field public g:Ljava/lang/Float;

.field public h:Lhy0;

.field public i:Lhy0;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lmy0;->d:I

    .line 5
    .line 6
    iput-object p2, p0, Lmy0;->e:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lmy0;->f:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, Lmy0;->g:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, Lmy0;->h:Lhy0;

    .line 14
    .line 15
    iput-object p1, p0, Lmy0;->i:Lhy0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmy0;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
