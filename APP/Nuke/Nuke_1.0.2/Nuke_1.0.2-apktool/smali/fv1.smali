.class public final Lfv1;
.super Liv1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Lfv1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lfv1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Liv1;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lfv1;->c:Lfv1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lbo0;Lrf;Ltr2;Lz72;Ljv1;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lbo0;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/4 p3, 0x1

    .line 7
    invoke-virtual {p1, p3}, Lbo0;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lmn0;

    .line 12
    .line 13
    invoke-interface {p2, p1, p0}, Lrf;->m(Lmn0;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
