.class public interface abstract Lnet/bytebuddy/build/RenamingPlugin$Renaming;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/RenamingPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Renaming"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/RenamingPlugin$Renaming$Compound;,
        Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;,
        Lnet/bytebuddy/build/RenamingPlugin$Renaming$NoOp;
    }
.end annotation


# virtual methods
.method public abstract apply(Ljava/lang/String;)Ljava/lang/String;
.end method
