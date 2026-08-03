.class public final LZ0;
.super LBn;
.source ""

# interfaces
.implements LUi;


# static fields
.field public static final b:LZ0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZ0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBn;-><init>(I)V

    sput-object v0, LZ0;->b:LZ0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    sget-object v0, LZu;->a:LYu;

    sget-object v0, LZu;->b:LC;

    invoke-virtual {v0}, LC;->a()Ljava/util/Random;

    move-result-object v0

    const/high16 v1, 0x7fff0000

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
