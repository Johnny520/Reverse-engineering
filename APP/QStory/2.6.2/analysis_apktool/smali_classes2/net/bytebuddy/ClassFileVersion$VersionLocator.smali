.class public interface abstract Lnet/bytebuddy/ClassFileVersion$VersionLocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/ClassFileVersion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VersionLocator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/ClassFileVersion$VersionLocator$Unresolved;,
        Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;,
        Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;
    }
.end annotation


# static fields
.field public static final EARLY_ACCESS:Ljava/lang/String; = "-ea"

.field public static final INTERNAL:Ljava/lang/String; = "-internal"

.field public static final JAVA_VERSION:Ljava/lang/String; = "java.version"


# virtual methods
.method public abstract resolve()Lnet/bytebuddy/ClassFileVersion;
.end method
