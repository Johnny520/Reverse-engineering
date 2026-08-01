.class Lcom/android/dx/command/dexer/Main$NotFilter;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NotFilter"
.end annotation


# instance fields
.field private final filter:Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$NotFilter;->filter:Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;Lcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$NotFilter;-><init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$NotFilter;->filter:Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;->accept(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method
