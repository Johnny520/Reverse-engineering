.class public final enum Lg/t;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ln/k;


# static fields
.field public static final enum d:Lg/t;

.field public static final enum e:Lg/t;

.field public static final enum f:Lg/t;

.field public static final enum g:Lg/t;

.field public static final enum h:Lg/t;

.field public static final enum i:Lg/t;

.field public static final enum j:Lg/t;

.field public static final enum k:Lg/t;

.field public static final enum l:Lg/t;

.field public static final enum m:Lg/t;

.field public static final enum n:Lg/t;

.field public static final enum o:Lg/t;

.field public static final enum p:Lg/t;

.field public static final enum q:Lg/t;

.field public static final enum r:Lg/t;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lg/t;

    const-string v1, "header_item"

    const-string v2, "TYPE_HEADER_ITEM"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->d:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "string_id_item"

    const-string v2, "TYPE_STRING_ID_ITEM"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->e:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "type_id_item"

    const-string v2, "TYPE_TYPE_ID_ITEM"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->f:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "proto_id_item"

    const-string v2, "TYPE_PROTO_ID_ITEM"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->g:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "field_id_item"

    const-string v2, "TYPE_FIELD_ID_ITEM"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "method_id_item"

    const-string v2, "TYPE_METHOD_ID_ITEM"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->h:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "class_def_item"

    const-string v2, "TYPE_CLASS_DEF_ITEM"

    const/4 v3, 0x6

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->i:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "call_site_id_item"

    const-string v2, "TYPE_CALL_SITE_ID_ITEM"

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "method_handle_item"

    const-string v2, "TYPE_METHOD_HANDLE_ITEM"

    const/16 v3, 0x8

    invoke-direct {v0, v2, v3, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "TYPE_MAP_LIST"

    const/16 v2, 0x9

    const/16 v3, 0x1000

    const-string v4, "map_list"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->j:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_TYPE_LIST"

    const/16 v2, 0xa

    const/16 v3, 0x1001

    const-string v4, "type_list"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->k:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_ANNOTATION_SET_REF_LIST"

    const/16 v2, 0xb

    const/16 v3, 0x1002

    const-string v4, "annotation_set_ref_list"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "TYPE_ANNOTATION_SET_ITEM"

    const/16 v2, 0xc

    const/16 v3, 0x1003

    const-string v4, "annotation_set_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "TYPE_CLASS_DATA_ITEM"

    const/16 v2, 0xd

    const/16 v3, 0x2000

    const-string v4, "class_data_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->l:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_CODE_ITEM"

    const/16 v2, 0xe

    const/16 v3, 0x2001

    const-string v4, "code_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->m:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_STRING_DATA_ITEM"

    const/16 v2, 0xf

    const/16 v3, 0x2002

    const-string v4, "string_data_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->n:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_DEBUG_INFO_ITEM"

    const/16 v2, 0x10

    const/16 v3, 0x2003

    const-string v4, "debug_info_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->o:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_ANNOTATION_ITEM"

    const/16 v2, 0x11

    const/16 v3, 0x2004

    const-string v4, "annotation_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "TYPE_ENCODED_ARRAY_ITEM"

    const/16 v2, 0x12

    const/16 v3, 0x2005

    const-string v4, "encoded_array_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->p:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_ANNOTATIONS_DIRECTORY_ITEM"

    const/16 v2, 0x13

    const/16 v3, 0x2006

    const-string v4, "annotations_directory_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->q:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "TYPE_MAP_ITEM"

    const/16 v2, 0x14

    const/4 v3, -0x1

    const-string v4, "map_item"

    invoke-direct {v0, v1, v2, v3, v4}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lg/t;->r:Lg/t;

    new-instance v0, Lg/t;

    const-string v1, "type_item"

    const-string v2, "TYPE_TYPE_ITEM"

    const/16 v4, 0x15

    invoke-direct {v0, v2, v4, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "exception_handler_item"

    const-string v2, "TYPE_EXCEPTION_HANDLER_ITEM"

    const/16 v4, 0x16

    invoke-direct {v0, v2, v4, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v0, Lg/t;

    const-string v1, "annotation_set_ref_item"

    const-string v2, "TYPE_ANNOTATION_SET_REF_ITEM"

    const/16 v4, 0x17

    invoke-direct {v0, v2, v4, v3, v1}, Lg/t;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lg/t;->a:I

    iput-object p4, p0, Lg/t;->b:Ljava/lang/String;

    const-string p1, "_item"

    invoke-virtual {p4, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x5

    const/4 p2, 0x0

    invoke-virtual {p4, p2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    :cond_0
    const/16 p1, 0x5f

    const/16 p2, 0x20

    invoke-virtual {p4, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lg/t;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg/t;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lg/t;->a:I

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg/t;->b:Ljava/lang/String;

    return-object v0
.end method
