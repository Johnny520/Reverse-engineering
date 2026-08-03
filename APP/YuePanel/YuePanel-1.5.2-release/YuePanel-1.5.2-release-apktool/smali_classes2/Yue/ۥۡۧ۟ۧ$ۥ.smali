.class public final LYue/ۥۡۧ۟ۧ$ۥ;
.super LYue/ۥ۟۟ۡۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۧ۟ۧ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e1<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۡۧ۟ۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06df\u06e7<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۧ۟ۧ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06df\u06e7<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۧ۟ۧ;

    invoke-direct {p0}, LYue/ۥ۟۟ۡۡ;-><init>()V

    invoke-virtual {p1}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result v0

    iput v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-static {p1}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟۟(LYue/ۥۡۧ۟ۧ;)I

    move-result p1

    iput p1, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۦ:I

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ۟()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۧ۟ۧ;

    invoke-static {v0}, LYue/ۥۡۧ۟ۧ;->ۥ۟(LYue/ۥۡۧ۟ۧ;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۦ:I

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, LYue/ۥ۟۟ۡۡ;->ۥ۟۟(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۧ۟ۧ;

    iget v1, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۦ:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟(LYue/ۥۡۧ۟ۧ;)I

    move-result v0

    rem-int/2addr v1, v0

    iput v1, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۦ:I

    iget v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥۡۧ۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    :goto_0
    return-void
.end method
