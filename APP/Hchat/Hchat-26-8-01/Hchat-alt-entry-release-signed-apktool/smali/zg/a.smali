.class public final synthetic Lzg/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lme/yun/silk/SilkCodec;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:I

.field public final synthetic l:Lme/yun/silk/utils/Conversion$ConversionCallback;


# direct methods
.method public synthetic constructor <init>(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzg/a;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lzg/a;->h:Lme/yun/silk/SilkCodec;

    .line 7
    .line 8
    iput-object p3, p0, Lzg/a;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lzg/a;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lzg/a;->k:I

    .line 13
    .line 14
    iput-object p6, p0, Lzg/a;->l:Lme/yun/silk/utils/Conversion$ConversionCallback;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v4, p0, Lzg/a;->k:I

    .line 2
    .line 3
    iget-object v5, p0, Lzg/a;->l:Lme/yun/silk/utils/Conversion$ConversionCallback;

    .line 4
    .line 5
    iget v0, p0, Lzg/a;->g:I

    .line 6
    .line 7
    iget-object v1, p0, Lzg/a;->h:Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    iget-object v2, p0, Lzg/a;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lzg/a;->j:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lme/yun/silk/utils/Conversion$Companion;->a(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
