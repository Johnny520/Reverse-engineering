.class public interface abstract Lnet/bytebuddy/NamingStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/NamingStrategy$PrefixingRandom;,
        Lnet/bytebuddy/NamingStrategy$SuffixingRandom;,
        Lnet/bytebuddy/NamingStrategy$Suffixing;,
        Lnet/bytebuddy/NamingStrategy$AbstractBase;
    }
.end annotation


# static fields
.field public static final BYTE_BUDDY_RENAME_PACKAGE:Ljava/lang/String; = "net.bytebuddy.renamed"

.field public static final NO_PREFIX:Ljava/lang/String; = ""


# virtual methods
.method public abstract rebase(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;
.end method

.method public abstract redefine(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;
.end method

.method public abstract subclass(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/String;
.end method
