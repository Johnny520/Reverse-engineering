.class public final LYue/ۥۣ۟ۤۢ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۤۢ;->ۥ۟۟([LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Throwable;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n75#2:480\n1#3:481\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n*L\n26#1:480\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[LYue/ۥۡۦۡۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([LYue/ۥۡۦۡۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۤۢ$ۥ۟۟;->ۥۣ۟۟۠:[LYue/ۥۡۦۡۡ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟;->ۥ۟۟(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Throwable;)V
    .locals 5
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۤۢ$ۥ۟۟;->ۥۣ۟۟۠:[LYue/ۥۡۦۡۡ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    :try_start_0
    invoke-static {v4, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_1

    :cond_0
    invoke-static {v2, v4}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return-void

    :cond_2
    throw v2
.end method
