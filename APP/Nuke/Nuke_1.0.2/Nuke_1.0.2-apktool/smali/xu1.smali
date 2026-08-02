.class public final Lxu1;
.super Liv1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Lxu1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxu1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Liv1;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxu1;->c:Lxu1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lbo0;Lrf;Ltr2;Lz72;Ljv1;)V
    .locals 0

    .line 1
    iget p0, p3, Ltr2;->t:I

    .line 2
    .line 3
    new-instance p1, Ls9;

    .line 4
    .line 5
    const/4 p2, 0x4

    .line 6
    invoke-direct {p1, p2, p4}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0, p1}, Ltr2;->n(ILmn0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Ltr2;->H()Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
