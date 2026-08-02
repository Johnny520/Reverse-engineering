.class public final Lzg1;
.super Ll01;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final H()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lzg1;->j:Ljava/lang/reflect/Method;

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

.method public final varargs g0([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ltl;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll01;->i:Ljava/lang/Object;

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
