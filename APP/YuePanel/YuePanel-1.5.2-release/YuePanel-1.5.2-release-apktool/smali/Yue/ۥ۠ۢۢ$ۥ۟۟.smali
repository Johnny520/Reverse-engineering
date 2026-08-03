.class public final LYue/ۥ۠ۢۢ$ۥ۟۟;
.super LYue/ۥ۠ۢۢ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠ۢۢ$ۥ۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠ۢۢ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥ۠ۢۢ$ۥ۟۟;-><init>()V

    sput-object v0, LYue/ۥ۠ۢۢ$ۥ۟۟;->ۥ:LYue/ۥ۠ۢۢ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۢۢ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(I)Ljava/nio/ByteBuffer;
    .locals 1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
