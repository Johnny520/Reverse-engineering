.class public final Lcom/android/dx/rop/code/RegisterSpec;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/rop/type/TypeBearer;
.implements Lcom/android/dx/util/ToHuman;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/rop/code/RegisterSpec$ForComparison;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/dx/rop/type/TypeBearer;",
        "Lcom/android/dx/util/ToHuman;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/rop/code/RegisterSpec;",
        ">;"
    }
.end annotation


# static fields
.field public static final PREFIX:Ljava/lang/String; = "v"

.field private static final theInterningItem:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/android/dx/rop/code/RegisterSpec$ForComparison;",
            ">;"
        }
    .end annotation
.end field

.field private static final theInterns:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Object;",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final local:Lcom/android/dx/rop/code/LocalItem;

.field private final reg:I

.field private final type:Lcom/android/dx/rop/type/TypeBearer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/android/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/rop/code/RegisterSpec$1;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/android/dx/rop/code/RegisterSpec$1;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/android/dx/rop/code/RegisterSpec;->theInterningItem:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "type == null"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    const-string p0, "reg < 0"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public synthetic constructor <init>(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;Lcom/android/dx/rop/code/RegisterSpec$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/rop/code/RegisterSpec;-><init>(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V

    return-void
.end method

.method public static synthetic access$500(Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/rop/code/RegisterSpec;->equals(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$600(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpec;->hashCodeOf(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static clearInternTable()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private equals(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z
    .locals 1

    .line 47
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    if-eq p0, p3, :cond_0

    if-eqz p0, :cond_1

    .line 49
    invoke-virtual {p0, p3}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static hashCodeOf(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)I
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/android/dx/rop/code/LocalItem;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    mul-int/lit8 p2, p2, 0x1f

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-int/2addr p1, p2

    .line 16
    mul-int/lit8 p1, p1, 0x1f

    .line 17
    .line 18
    add-int/2addr p1, p0

    .line 19
    return p1
.end method

.method private static intern(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpec;->theInterningItem:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->set(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lcom/android/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->toRegisterSpec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lcom/android/dx/rop/code/RegisterSpec;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    return-object p1
.end method

.method public static make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-static {p0, p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->intern(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static make(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpec;->intern(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "local  == null"

    .line 9
    .line 10
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpec;->intern(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static regString(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private toString0(Z)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ":"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/android/dx/rop/code/LocalItem;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 32
    .line 33
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 41
    .line 42
    if-eq v1, v2, :cond_3

    .line 43
    .line 44
    const-string v1, "="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 52
    .line 53
    instance-of v2, v1, Lcom/android/dx/rop/cst/CstString;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    check-cast v1, Lcom/android/dx/rop/cst/CstString;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    if-eqz p1, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 70
    .line 71
    instance-of v1, p1, Lcom/android/dx/rop/cst/Constant;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-interface {p1}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/rop/code/RegisterSpec;)I
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v3, 0x1

    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    return v3

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    if-ne p0, p1, :cond_2

    .line 15
    .line 16
    return v0

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v4, p1, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 24
    .line 25
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/type/Type;->compareTo(Lcom/android/dx/rop/type/Type;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 39
    .line 40
    if-nez p0, :cond_5

    .line 41
    .line 42
    if-nez p1, :cond_4

    .line 43
    .line 44
    return v0

    .line 45
    :cond_4
    return v2

    .line 46
    :cond_5
    if-nez p1, :cond_6

    .line 47
    .line 48
    return v3

    .line 49
    :cond_6
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->compareTo(Lcom/android/dx/rop/code/LocalItem;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 54
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->compareTo(Lcom/android/dx/rop/code/RegisterSpec;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    instance-of v0, p1, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->access$100(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->access$200(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)Lcom/android/dx/rop/type/TypeBearer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->access$300(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)Lcom/android/dx/rop/code/LocalItem;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, v0, v1, p1}, Lcom/android/dx/rop/code/RegisterSpec;->equals(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_2
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 35
    .line 36
    iget v0, p1, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 37
    .line 38
    iget-object v1, p1, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 41
    .line 42
    invoke-direct {p0, v0, v1, p1}, Lcom/android/dx/rop/code/RegisterSpec;->equals(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public equalsUsingSimpleType(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->matchesVariable(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 10
    .line 11
    iget p1, p1, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 12
    .line 13
    if-ne p0, p1, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
.end method

.method public final getBasicFrameType()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getBasicFrameType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getBasicType()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getCategory()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getFrameType()Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getLocalItem()Lcom/android/dx/rop/code/LocalItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNextReg()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    add-int/2addr p0, v0

    .line 8
    return p0
.end method

.method public getReg()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    return p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->hashCodeOf(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public intersect(Lcom/android/dx/rop/code/RegisterSpec;Z)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_a

    .line 6
    .line 7
    iget v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_1
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    :goto_0
    move-object v1, v0

    .line 35
    :goto_1
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 36
    .line 37
    if-ne v1, v2, :cond_4

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_4
    const/4 v2, 0x0

    .line 42
    :goto_2
    if-eqz p2, :cond_5

    .line 43
    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_5
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-eq p2, v3, :cond_6

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_6
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    iget-object p2, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 71
    .line 72
    :cond_7
    iget-object p1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 73
    .line 74
    if-ne p2, p1, :cond_8

    .line 75
    .line 76
    if-eqz v2, :cond_8

    .line 77
    .line 78
    :goto_3
    return-object p0

    .line 79
    :cond_8
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 80
    .line 81
    if-nez v1, :cond_9

    .line 82
    .line 83
    invoke-static {p0, p2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_9
    invoke-static {p0, p2, v1}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_a
    :goto_4
    return-object v0
.end method

.method public isCategory1()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final isConstant()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isEvenRegister()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    and-int/2addr p0, v0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public matchesVariable(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p1, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 26
    .line 27
    if-eq p0, p1, :cond_1

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    :cond_1
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    return v0
.end method

.method public regString()Ljava/lang/String;
    .locals 0

    .line 8
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    invoke-static {p0}, Lcom/android/dx/rop/code/RegisterSpec;->regString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec;->toString0(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec;->toString0(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public withLocalItem(Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 15
    .line 16
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 17
    .line 18
    invoke-static {v0, p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    :goto_0
    return-object p0
.end method

.method public withOffset(I)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 5
    .line 6
    add-int/2addr v0, p1

    .line 7
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public withReg(I)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 9
    .line 10
    invoke-static {p1, v0, p0}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public withSimpleType()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/android/dx/rop/type/Type;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isUninitialized()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->getInitializedType()Lcom/android/dx/rop/type/Type;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_1
    if-ne v1, v0, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 29
    .line 30
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 31
    .line 32
    invoke-static {v0, v1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public withType(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec;->reg:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 4
    .line 5
    invoke-static {v0, p1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
