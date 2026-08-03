.class public LYue/ۥۣۢۤۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۤۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/nio/charset/CharsetEncoder;

.field public final ۥ۟:Ljava/nio/charset/CharsetDecoder;

.field public ۥ۟۟:Ljava/lang/CharSequence;

.field public ۥ۟۟۟:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣۢۤۥ$ۥ;->ۥ۟۟:Ljava/lang/CharSequence;

    iput-object v0, p0, LYue/ۥۣۢۤۥ$ۥ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢۤۥ$ۥ;->ۥ:Ljava/nio/charset/CharsetEncoder;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣۢۤۥ$ۥ;->ۥ۟:Ljava/nio/charset/CharsetDecoder;

    return-void
.end method
