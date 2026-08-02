.class public final Lpi0;
.super Ll01;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpi0;->j:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final H()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lpi0;->j:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f0(Ljava/lang/Object;)Ll01;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ll01;->e0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final g0()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ltl;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpi0;->j:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    iget-object p0, p0, Ll01;->i:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
