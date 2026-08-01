.class final enum Lcom/android/dx/dex/file/MixedItemSection$SortType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/file/MixedItemSection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SortType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/dex/file/MixedItemSection$SortType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/dex/file/MixedItemSection$SortType;

.field public static final enum INSTANCE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

.field public static final enum NONE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

.field public static final enum TYPE:Lcom/android/dx/dex/file/MixedItemSection$SortType;


# direct methods
.method private static synthetic $values()[Lcom/android/dx/dex/file/MixedItemSection$SortType;
    .locals 3

    .line 1
    sget-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->NONE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/dex/file/MixedItemSection$SortType;->TYPE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 4
    .line 5
    sget-object v2, Lcom/android/dx/dex/file/MixedItemSection$SortType;->INSTANCE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/android/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->NONE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 10
    .line 11
    new-instance v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 12
    .line 13
    const-string v1, "TYPE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/android/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->TYPE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 20
    .line 21
    new-instance v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 22
    .line 23
    const-string v1, "INSTANCE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/android/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->INSTANCE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 30
    .line 31
    invoke-static {}, Lcom/android/dx/dex/file/MixedItemSection$SortType;->$values()[Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->$VALUES:[Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/dex/file/MixedItemSection$SortType;
    .locals 1

    .line 1
    const-class v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/android/dx/dex/file/MixedItemSection$SortType;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/dex/file/MixedItemSection$SortType;->$VALUES:[Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/android/dx/dex/file/MixedItemSection$SortType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 8
    .line 9
    return-object v0
.end method
