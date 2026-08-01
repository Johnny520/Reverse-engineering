.class public final L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪兰世苏哲;


# static fields
.field public static final 飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

.field public static final 飘花落叶言子楪兰哲苏世:Z


# instance fields
.field public 飘花落叶言子楪兰世哲苏:[Ljava/lang/String;

.field public 飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

.field public 飘花落叶言子楪兰哲世苏:[Ljava/lang/String;

.field public 飘花落叶言子楪兰苏世哲:[Ljava/lang/String;

.field public 飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "true"

    .line 2
    .line 3
    const-string v1, "kotlin.ignore.old.metadata"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput-boolean v0, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世:Z
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    sput-boolean v0, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世:Z

    .line 18
    .line 19
    :goto_0
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

    .line 25
    .line 26
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    const-string v2, "kotlin.jvm.internal.KotlinClass"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->CLASS:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    const-string v2, "kotlin.jvm.internal.KotlinFileFacade"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->FILE_FACADE:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 59
    .line 60
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClass"

    .line 61
    .line 62
    invoke-direct {v1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->MULTIFILE_CLASS:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 75
    .line 76
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClassPart"

    .line 77
    .line 78
    invoke-direct {v1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->MULTIFILE_CLASS_PART:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 91
    .line 92
    const-string v2, "kotlin.jvm.internal.KotlinSyntheticClass"

    .line 93
    .line 94
    invoke-direct {v1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->SYNTHETIC_CLASS:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪哲兰世苏;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance p1, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p1, p0, p2}, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;I)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    new-instance p1, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    invoke-direct {p1, p0, p2}, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;I)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    sget-boolean p2, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世:Z

    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p2, p0, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-object p2, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iput-object p1, p0, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 56
    .line 57
    new-instance p1, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    invoke-direct {p1, p0, p2}, L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世楪哲子兰苏/飘花落叶言子楪世兰哲苏;I)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method
