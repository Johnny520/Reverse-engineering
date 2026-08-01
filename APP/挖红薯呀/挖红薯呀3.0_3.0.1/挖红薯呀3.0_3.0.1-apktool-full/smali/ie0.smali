.class public final Lie0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static h:Lie0;


# instance fields
.field public final a:Lk50;

.field public final b:Ls71;

.field public final c:Lzm;

.field public final d:Ljv;

.field public final e:Ls71;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Lk50;Ls71;Lzm;Ljv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lie0;->a:Lk50;

    .line 5
    .line 6
    iput-object p2, p0, Lie0;->b:Ls71;

    .line 7
    .line 8
    iput-object p3, p0, Lie0;->c:Lzm;

    .line 9
    .line 10
    iput-object p4, p0, Lie0;->d:Ljv;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lz60;->M(Ls71;Lk50;)Ls71;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lie0;->e:Ls71;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Lie0;->f:F

    .line 21
    .line 22
    iput p1, p0, Lie0;->g:F

    .line 23
    .line 24
    return-void
.end method
