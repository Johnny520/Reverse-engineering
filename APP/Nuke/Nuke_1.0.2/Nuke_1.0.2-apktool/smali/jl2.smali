.class public final Ljl2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Law1;


# instance fields
.field public final h:I

.field public final i:Ljava/util/List;

.field public j:Ljava/lang/Float;

.field public k:Ljava/lang/Float;

.field public l:Lel2;

.field public m:Lel2;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ljl2;->h:I

    .line 5
    .line 6
    iput-object p2, p0, Ljl2;->i:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Ljl2;->j:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, Ljl2;->k:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, Ljl2;->l:Lel2;

    .line 14
    .line 15
    iput-object p1, p0, Ljl2;->m:Lel2;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljl2;->i:Ljava/util/List;

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
