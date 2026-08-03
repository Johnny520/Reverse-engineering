.class public Lcom/shoujiduoduo/util/NativeDES;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native Decrypt(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native Encrypt(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native EncryptByteArray([B)Ljava/lang/String;
.end method
