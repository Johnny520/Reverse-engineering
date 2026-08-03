.class public final LYue/ۥ۟ۤۢۨ$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8541#2,2:124\n8801#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤۢۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/util/Map<",
        "Ljava/lang/Integer;",
        "+",
        "LYue/\u06e5\u06df\u06e4\u06e2\u06e8;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8541#2,2:124\n8801#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥ۟ۤۢۨ$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۤۢۨ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۤۢۨ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۢۨ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥ۟ۤۢۨ$ۥ;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06df\u06e4\u06e2\u06e8;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {}, LYue/ۥ۟ۤۢۨ;->values()[LYue/ۥ۟ۤۢۨ;

    move-result-object v0

    .line 3
    array-length v1, v0

    invoke-static {v1}, LYue/ۥ۠ۨۧۦ;->ۥ۟۟۟ۤ(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۤ(II)I

    move-result v1

    .line 4
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 5
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 6
    invoke-virtual {v4}, LYue/ۥ۟ۤۢۨ;->ۥ۟۟۟۠()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 7
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
