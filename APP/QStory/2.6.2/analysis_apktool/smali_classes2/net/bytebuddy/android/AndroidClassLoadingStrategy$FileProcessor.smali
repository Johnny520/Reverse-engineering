.class public interface abstract Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FileProcessor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$Disabled;
    }
.end annotation


# virtual methods
.method public abstract accept(Ljava/io/File;)V
.end method
