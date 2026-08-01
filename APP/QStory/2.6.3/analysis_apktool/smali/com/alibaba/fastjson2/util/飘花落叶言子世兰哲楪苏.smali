.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-class v1, [B

    .line 4
    .line 5
    const-class v2, [C

    .line 6
    .line 7
    sget v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 8
    .line 9
    const/16 v4, 0x9

    .line 10
    .line 11
    if-le v3, v4, :cond_0

    .line 12
    .line 13
    :try_start_0
    const-string v3, "java.lang.StringLatin1"

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "toChars"

    .line 24
    .line 25
    invoke-static {v2, v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v4, v3, v5, v6}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    const-string v5, "apply"

    .line 34
    .line 35
    const-class v3, Ljava/util/function/Function;

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-static {v0, v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-static {v2, v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-static/range {v4 .. v9}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Function;

    .line 58
    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 64
    :goto_0
    if-nez v0, :cond_1

    .line 65
    .line 66
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰苏哲楪;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    :cond_1
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/util/function/Function;

    .line 72
    .line 73
    return-void
.end method
