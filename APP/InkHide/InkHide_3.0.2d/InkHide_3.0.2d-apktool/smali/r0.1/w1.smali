.class public final synthetic Lr0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lr0/x1;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr0/x1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/w1;->a:Landroid/content/Context;

    iput-object p2, p0, Lr0/w1;->b:Ljava/lang/String;

    iput-object p6, p0, Lr0/w1;->c:Lr0/x1;

    iput-object p3, p0, Lr0/w1;->d:Ljava/lang/String;

    iput-object p4, p0, Lr0/w1;->e:Ljava/lang/String;

    iput-object p5, p0, Lr0/w1;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    iget-object v1, p0, Lr0/w1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lr0/w1;->c:Lr0/x1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lr0/x1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v1}, Lr0/x1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "\n            <msg>\n              <appmsg appid=\"\" sdkver=\"0\">\n                <title>\u5f53\u524d\u7248\u672c\u4e0d\u652f\u6301\u5c55\u793a\u8be5\u5185\u5bb9\uff0c\u8bf7\u5347\u7ea7\u81f3\u6700\u65b0\u7248\u672c\u3002</title>\n                <action>view</action>\n                <type>51</type>\n                <url>https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade</url>\n                <finderFeed>\n                  <objectId>14667626555619936481</objectId>\n                  <objectNonceId>8625307247096037618_0_12_2_1_1748600110424042_f7dd7f2e-3d3e-11f0-adb0-43719c7e1fc7</objectNonceId>\n                  <feedType>4</feedType>\n                  <username>v2_060000231003b20faec8cae38d1ac4d6c800e435b077830e54ceb941efb42210f69f736d359b@finder</username>\n                  <avatar><![CDATA[https://wx.qlogo.cn/finderhead/ver_1/MiawsaiaO8qpgTJBRD70ROuXN6En8LoKZ266tvlLeRGRHbb7CvcqKrxH19a2mxiafeuCoakYZhsf1u3AYEB3BooKZ6lpCfRVnsfjMfMHC4ibR67iaV6rR4qZ5Irmal16AFpQ0/0]]></avatar>\n                  <desc>"

    .line 21
    .line 22
    const-string v6, "</desc>\n                  <mediaCount>1</mediaCount>\n                  <authIconType>1</authIconType>\n                  <authIconUrl><![CDATA[https://dldir1v6.qq.com/weixin/checkresupdate/auth_icon_level3_2e2f94615c1e4651a25a7e0446f63135.png]]></authIconUrl>\n                  <mediaList>\n                    <media>\n                      <mediaType>4</mediaType>\n                      <url><![CDATA[http://wxapp.tc.qq.com/251/20302/stodownload?encfilekey=rjD5jyTuFrIpZ2ibE8T7YmwgiahniaXswqz0uUhqGrF2B7C1FqN4dW4RUFEqbMlm05rmPXfSmjgCf3G9ia8ia5kibCH5kxIczTrbCbgAqYUvKicB0IA1udGCuzXpw&hy=SH&idx=1&m=&uzid=7a15c&token=cztXnd9GyrE6cgMDsjj0eZ1MdRB3Eib2ic7rNkGkF4Z9FR5nuld6Yiap9VEugIeCegbHKzjOSMHy5EPTzfChDe3YZJjiaR7aiaFbEzmJ7lsaIjCkSIMxuHkzHibDgX42h1Lq3VySAfoEl06sU0vskxMYumKLA4llQm1WU2hX00ItegJ0c&basedata=CAESBnhXVDE1MRoGeFdUMTExGgZ4V1QxMTIaBnhXVDE1MxoGeFdUMTU2GgZ4V1QxNTEaBnhXVDE1NxoGeFdUMTU4IhgKCgoGeFdUMTEyEAEKCgoGeFdUMTU3EAEqBwiYHRAAGAI&sign=60es22k_sbg7L-LeRKkcDVtXNMBrP54gaTyqCSSs7KRwQm_cI792BPZxaghvauP9954aUbkgAXldv-6hcaDvjA&ctsc=12&extg=10eb900&svrbypass=AAuL%2FQsFAAABAAAAAAC%2B28t6CjV1pwlsLoU5aBAAAADnaHZTnGbFfAj9RgZXfw6Vfkx7FpiL%2B22LVp4HLkn05tij40%2FAsJD%2BPQrMho6FgQX6w1ETaBHqHtM%3D&svrnonce=1748600110]]></url>\n                      <thumbUrl><![CDATA["

    .line 23
    .line 24
    invoke-static {v3, v2, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Lr0/w1;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v6, "]]></thumbUrl>\n                      <coverUrl><![CDATA["

    .line 34
    .line 35
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "]]></coverUrl>\n                      <width>1080.0</width>\n                      <height>1920.0</height>\n                      <videoPlayDuration>8</videoPlayDuration>\n                    </media>\n                  </mediaList>\n                  <sourceCommentScene>1</sourceCommentScene>\n                  <finderShareExtInfo><![CDATA[{\"hasInput\":false,\"tabContextId\":\"4-1748600105044\",\"contextId\":\"1-1-17-e669331b7d4243ecae426b3a64ec81b5\",\"shareSrcScene\":4}]]></finderShareExtInfo>\n                </finderFeed>\n              </appmsg>\n            </msg>\n        "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, LU0/j;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2}, Lr0/x1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    const/16 v3, 0x3e8

    .line 63
    .line 64
    int-to-long v8, v3

    .line 65
    div-long/2addr v6, v8

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v8, "\n            <msg>\n              <appmsg appid=\"\" sdkver=\"0\">\n                <title>"

    .line 69
    .line 70
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "</title>\n                <action>view</action>\n                <type>57</type>\n                <refermsg>\n                  <type>49</type>\n                  <svrid>3081795456970157299</svrid>\n                  <fromusr>wxid_</fromusr>\n                  <chatusr>wxid_</chatusr>\n                  <displayname> </displayname>\n                  <msgsource>&lt;msgsource&gt;&lt;alnode&gt;&lt;fr&gt;2&lt;/fr&gt;&lt;/alnode&gt;&lt;sec_msg_node&gt;&lt;/sec_msg_node&gt;&lt;/msgsource&gt;</msgsource>\n                  <content>"

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, "</content>\n                  <createtime>"

    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, "</createtime>\n                </refermsg>\n              </appmsg>\n            </msg>\n        "

    .line 93
    .line 94
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, LU0/j;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v8, p0, Lr0/w1;->a:Landroid/content/Context;

    .line 106
    .line 107
    iget-object v12, p0, Lr0/w1;->b:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v8}, Lz0/r;->y(Landroid/content/Context;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/4 v3, 0x0

    .line 114
    if-nez v2, :cond_0

    .line 115
    .line 116
    const-string v0, "read trace sender not prepared"

    .line 117
    .line 118
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :goto_0
    move v9, v3

    .line 126
    goto/16 :goto_9

    .line 127
    .line 128
    :cond_0
    const-string v2, "<title>"

    .line 129
    .line 130
    const/4 v6, 0x6

    .line 131
    invoke-static {v0, v2, v3, v3, v6}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    const/4 v7, 0x4

    .line 136
    const/4 v9, 0x7

    .line 137
    const-string v10, "substring(...)"

    .line 138
    .line 139
    const-string v11, ""

    .line 140
    .line 141
    if-gez v2, :cond_1

    .line 142
    .line 143
    :goto_1
    move-object v2, v11

    .line 144
    goto :goto_2

    .line 145
    :cond_1
    add-int/2addr v2, v9

    .line 146
    const-string v13, "</title>"

    .line 147
    .line 148
    invoke-static {v0, v13, v2, v3, v7}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-gez v13, :cond_2

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    invoke-virtual {v0, v2, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {v2, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    const-string v13, "appid=\""

    .line 163
    .line 164
    invoke-static {v0, v13, v3, v3, v6}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-gez v6, :cond_3

    .line 169
    .line 170
    :goto_3
    move-object v10, v11

    .line 171
    goto :goto_4

    .line 172
    :cond_3
    add-int/2addr v9, v6

    .line 173
    const/16 v6, 0x22

    .line 174
    .line 175
    invoke-static {v0, v6, v9, v7}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-gez v6, :cond_4

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_4
    invoke-virtual {v0, v9, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-static {v11, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :goto_4
    :try_start_0
    sget-object v6, Lz0/r;->i:Ljava/lang/reflect/Method;

    .line 191
    .line 192
    if-eqz v6, :cond_7

    .line 193
    .line 194
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const/4 v7, 0x0

    .line 199
    invoke-virtual {v6, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    if-nez v9, :cond_5

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_5
    sget-object v0, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 207
    .line 208
    if-eqz v0, :cond_6

    .line 209
    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v13, 0x0

    .line 212
    move-object v11, v2

    .line 213
    filled-new-array/range {v9 .. v14}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v0, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :catchall_0
    move-exception v0

    .line 222
    goto :goto_7

    .line 223
    :cond_6
    :goto_5
    const/4 v3, 0x1

    .line 224
    :cond_7
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    goto :goto_8

    .line 229
    :goto_7
    new-instance v2, LE0/d;

    .line 230
    .line 231
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    move-object v0, v2

    .line 235
    :goto_8
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    if-eqz v2, :cond_8

    .line 240
    .line 241
    const-string v3, "read trace send xml appmsg fail"

    .line 242
    .line 243
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_8
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 251
    .line 252
    instance-of v3, v0, LE0/d;

    .line 253
    .line 254
    if-eqz v3, :cond_9

    .line 255
    .line 256
    move-object v0, v2

    .line 257
    :cond_9
    check-cast v0, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :goto_9
    iget-object v2, p0, Lr0/w1;->f:Ljava/lang/String;

    .line 266
    .line 267
    if-eqz v9, :cond_c

    .line 268
    .line 269
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 270
    .line 271
    invoke-static {v12}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-nez v0, :cond_b

    .line 276
    .line 277
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_a

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :cond_a
    invoke-static {}, Lz0/q;->e()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    new-instance v0, Lv0/a;

    .line 293
    .line 294
    invoke-direct {v0, v2}, Lv0/a;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v10, v0}, LF0/q;->g0(Ljava/util/ArrayList;LM0/l;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, Lz0/p;

    .line 301
    .line 302
    const/16 v3, 0x50

    .line 303
    .line 304
    invoke-static {v3, v1}, LU0/i;->B0(ILjava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    const-string v6, ""

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    move-object v1, v12

    .line 312
    invoke-direct/range {v0 .. v7}, Lz0/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    invoke-static {v10}, Lz0/q;->b(Ljava/util/ArrayList;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Lz0/q;->l(Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    const-string v0, "read trace monitor record"

    .line 326
    .line 327
    filled-new-array {v0, v12, v2}, [Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    :goto_a
    invoke-static {v8, v12}, Lz0/q;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_c
    if-eqz v9, :cond_d

    .line 338
    .line 339
    const-string v0, "\u5df2\u53d1\u9001\u5df2\u8bfb\u8ffd\u8e2a\uff1a"

    .line 340
    .line 341
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    goto :goto_b

    .line 346
    :cond_d
    const-string v0, "\u5df2\u8bfb\u8ffd\u8e2a\u53d1\u9001\u5931\u8d25"

    .line 347
    .line 348
    :goto_b
    invoke-static {v8, v0}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v1, "sent="

    .line 354
    .line 355
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    const-string v1, "target="

    .line 366
    .line 367
    invoke-virtual {v1, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v3, "trackId="

    .line 372
    .line 373
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const-string v3, "read trace send result"

    .line 378
    .line 379
    filled-new-array {v3, v0, v1, v2}, [Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-void
.end method
