.class public final synthetic Lon;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/result/ClassData;I)V
    .locals 0

    .line 1
    iput p2, p0, Lon;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lon;->e:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lon;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lon;->e:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lrn;->L1(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lrn;->B0(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/query/FindMethod;)Lna1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
