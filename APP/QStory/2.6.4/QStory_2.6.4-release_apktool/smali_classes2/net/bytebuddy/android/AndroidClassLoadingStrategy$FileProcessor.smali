.class public interface abstract Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
