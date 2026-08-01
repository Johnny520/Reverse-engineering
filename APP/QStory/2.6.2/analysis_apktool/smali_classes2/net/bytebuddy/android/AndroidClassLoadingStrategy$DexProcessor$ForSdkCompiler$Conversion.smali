.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Conversion"
.end annotation


# static fields
.field private static final NON_STRICT:Z = false


# instance fields
.field private final dexFile:Lcom/android/dx/dex/file/DexFile;

.field final synthetic this$0:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->this$0:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->dexFile:Lcom/android/dx/dex/file/DexFile;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public drainTo(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->dexFile:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->access$300()Ljava/io/Writer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lcom/android/dx/dex/file/DexFile;->writeTo(Ljava/io/OutputStream;Ljava/io/Writer;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public register(Ljava/lang/String;[B)V
    .locals 6

    .line 1
    new-instance v1, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x2e

    .line 9
    .line 10
    const/16 v3, 0x2f

    .line 11
    .line 12
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, ".class"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {v1, p2, p1, v0}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>([BLjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 33
    .line 34
    invoke-direct {p1}, Lcom/android/dx/cf/direct/StdAttributeFactory;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->dexFile:Lcom/android/dx/dex/file/DexFile;

    .line 41
    .line 42
    invoke-static {}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->access$200()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->this$0:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    .line 47
    .line 48
    invoke-static {v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->access$000(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/cf/CfOptions;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->this$0:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    .line 53
    .line 54
    invoke-static {v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->access$100(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/DexOptions;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, Lcom/android/dx/dex/file/DexFile;

    .line 59
    .line 60
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;->this$0:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    .line 61
    .line 62
    invoke-static {p0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->access$100(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/DexOptions;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v5, p0}, Lcom/android/dx/dex/file/DexFile;-><init>(Lcom/android/dx/dex/DexOptions;)V

    .line 67
    .line 68
    .line 69
    move-object v2, p2

    .line 70
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;->translate(Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/DexFile;->add(Lcom/android/dx/dex/file/ClassDefItem;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
