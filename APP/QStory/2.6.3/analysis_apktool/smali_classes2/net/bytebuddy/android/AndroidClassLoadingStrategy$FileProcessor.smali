.class public interface abstract Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
